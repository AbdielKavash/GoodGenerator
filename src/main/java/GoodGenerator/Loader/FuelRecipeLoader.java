package GoodGenerator.Loader;

import GoodGenerator.Items.MyMaterial;
import GoodGenerator.util.MyRecipeAdder;
import com.github.bartimaeusnek.bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class FuelRecipeLoader {
    public static void RegisterFuel(){
        //MyRecipeAdder.instance.addLiquidMentalFuel(Materials.NaquadahEnriched.getMolten(1L),Materials.Naquadah.getMolten(1L),32768,100);
        //MyRecipeAdder.instance.addLiquidMentalFuel(Materials.Naquadria.getMolten(1L),Materials.Naquadah.getMolten(1L),262144,120);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.uraniumBasedLiquidFuelExcited.getFluidOrGas(1),MyMaterial.uraniumBasedLiquidFuelDepleted.getFluidOrGas(1),12960,100);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.thoriumBasedLiquidFuelExcited.getFluidOrGas(1),MyMaterial.thoriumBasedLiquidFuelDepleted.getFluidOrGas(1),4320,500);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.plutoniumBasedLiquidFuelExcited.getFluidOrGas(1),MyMaterial.plutoniumBasedLiquidFuelDepleted.getFluidOrGas(1),32400,150);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.naquadahBasedFuelMkI.getFluidOrGas(1),MyMaterial.naquadahBasedFuelMkIDepleted.getFluidOrGas(1),288000,320);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.naquadahBasedFuelMkII.getFluidOrGas(1),MyMaterial.naquadahBasedFuelMkIIDepleted.getFluidOrGas(1),1276000,100);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.naquadahBasedFuelMkIII.getFluidOrGas(1),MyMaterial.naquadahBasedFuelMkIIIDepleted.getFluidOrGas(1),7290000,120);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.naquadahBasedFuelMkIV.getFluidOrGas(1),MyMaterial.naquadahBasedFuelMkIVDepleted.getFluidOrGas(1),69270000,120);
        MyRecipeAdder.instance.addLiquidMentalFuel(MyMaterial.naquadahBasedFuelMkV.getFluidOrGas(1),MyMaterial.naquadahBasedFuelMkVDepleted.getFluidOrGas(1),537284000,140);

        MyRecipeAdder.instance.addNaquadahFuelRefineRecipe(
                new FluidStack[]{
                        MyMaterial.heavyNaquadahFuel.getFluidOrGas(500),
                        MyMaterial.lightNaquadahFuel.getFluidOrGas(1000),
                },
                new ItemStack[]{
                        MyMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust,4),
                        WerkstoffLoader.Tiberium.get(OrePrefixes.dust,27)
                },
                MyMaterial.naquadahBasedFuelMkIII.getFluidOrGas(100),
                120000,
                850,
                1
        );

        MyRecipeAdder.instance.addNaquadahFuelRefineRecipe(
                new FluidStack[]{
                        MyMaterial.naquadahBasedFuelMkIII.getFluidOrGas(2000),
                        Materials.Praseodymium.getMolten(9216L)
                },
                new ItemStack[]{
                        MyMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust,27),
                        MyMaterial.orundum.get(OrePrefixes.dust,8),
                        new ItemStack(Loaders.highDensityUranium,16),
                        new ItemStack(Loaders.highDensityPlutonium,3)
                },
                MyMaterial.naquadahBasedFuelMkIV.getFluidOrGas(250),
                56000000,
                1400,
                2
        );

        MyRecipeAdder.instance.addNaquadahFuelRefineRecipe(
                new FluidStack[]{
                        MyMaterial.naquadahBasedFuelMkIV.getFluidOrGas(2000),
                        FluidRegistry.getFluidStack("heavyradox",5000),
                },
                new ItemStack[]{
                        GT_OreDictUnificator.get(OrePrefixes.dust,Materials.DraconiumAwakened,64),
                        GT_OreDictUnificator.get(OrePrefixes.dust,Materials.Infinity,64),
                        GT_OreDictUnificator.get(OrePrefixes.dust,Materials.NetherStar,64)
                },
                MyMaterial.naquadahBasedFuelMkV.getFluidOrGas(500),
                140000000,
                3200,
                2
        );
    }
}