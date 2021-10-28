package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InventoryConfigurationProperty {

  def apply(
    prefix: Option[String] = None,
    enabled: Option[Boolean] = None,
    scheduleFrequency: Option[String] = None,
    includedObjectVersions: Option[String] = None,
    id: Option[String] = None,
    optionalFields: Option[List[String]] = None,
    destination: Option[software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder)
      .prefix(prefix.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scheduleFrequency(scheduleFrequency.orNull)
      .includedObjectVersions(includedObjectVersions.orNull)
      .id(id.orNull)
      .optionalFields(optionalFields.map(_.asJava).orNull)
      .destination(destination.orNull)
      .build()
}
