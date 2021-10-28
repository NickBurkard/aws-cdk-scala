package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CapacityUnitsConfigurationProperty {

  def apply(
    queryCapacityUnits: Option[Number] = None,
    storageCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty.Builder)
      .queryCapacityUnits(queryCapacityUnits.orNull)
      .storageCapacityUnits(storageCapacityUnits.orNull)
      .build()
}
