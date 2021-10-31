package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlApplicationConfigurationProperty {

  def apply(
    inputs: Option[List[_]] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder)
      .inputs(inputs.map(_.asJava).orNull)
      .build()
}
