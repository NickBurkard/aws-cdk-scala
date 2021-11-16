package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityUnitsConfigurationProperty {

  def apply(
    queryCapacityUnits: Number,
    storageCapacityUnits: Number
  ): software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty.Builder)
      .queryCapacityUnits(queryCapacityUnits)
      .storageCapacityUnits(storageCapacityUnits)
      .build()
}
