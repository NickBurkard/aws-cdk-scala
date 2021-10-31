package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentPropertiesProperty {

  def apply(
    propertyGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder)
      .propertyGroups(propertyGroups.map(_.asJava).orNull)
      .build()
}
