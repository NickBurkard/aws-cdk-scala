package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Inventory {

  def apply(
    format: Option[software.amazon.awscdk.services.s3.InventoryFormat] = None,
    inventoryId: Option[String] = None,
    optionalFields: Option[List[String]] = None,
    objectsPrefix: Option[String] = None,
    frequency: Option[software.amazon.awscdk.services.s3.InventoryFrequency] = None,
    destination: Option[software.amazon.awscdk.services.s3.InventoryDestination] = None,
    enabled: Option[Boolean] = None,
    includeObjectVersions: Option[software.amazon.awscdk.services.s3.InventoryObjectVersion] = None
  ): software.amazon.awscdk.services.s3.Inventory =
    (new software.amazon.awscdk.services.s3.Inventory.Builder)
      .format(format.orNull)
      .inventoryId(inventoryId.orNull)
      .optionalFields(optionalFields.map(_.asJava).orNull)
      .objectsPrefix(objectsPrefix.orNull)
      .frequency(frequency.orNull)
      .destination(destination.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeObjectVersions(includeObjectVersions.orNull)
      .build()
}
