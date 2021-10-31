package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PutAssetPropertyValueEntryProperty {

  def apply(
    propertyAlias: Option[String] = None,
    entryId: Option[String] = None,
    assetId: Option[String] = None,
    propertyId: Option[String] = None,
    propertyValues: Option[List[_]] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder)
      .propertyAlias(propertyAlias.orNull)
      .entryId(entryId.orNull)
      .assetId(assetId.orNull)
      .propertyId(propertyId.orNull)
      .propertyValues(propertyValues.map(_.asJava).orNull)
      .build()
}
