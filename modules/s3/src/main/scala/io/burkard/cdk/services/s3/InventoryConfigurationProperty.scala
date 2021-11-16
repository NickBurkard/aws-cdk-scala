package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InventoryConfigurationProperty {

  def apply(
    enabled: Boolean,
    scheduleFrequency: String,
    includedObjectVersions: String,
    id: String,
    destination: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty,
    prefix: Option[String] = None,
    optionalFields: Option[List[String]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder)
      .enabled(enabled)
      .scheduleFrequency(scheduleFrequency)
      .includedObjectVersions(includedObjectVersions)
      .id(id)
      .destination(destination)
      .prefix(prefix.orNull)
      .optionalFields(optionalFields.map(_.asJava).orNull)
      .build()
}
