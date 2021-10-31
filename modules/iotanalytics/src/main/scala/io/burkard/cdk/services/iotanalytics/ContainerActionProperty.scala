package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerActionProperty {

  def apply(
    image: Option[String] = None,
    variables: Option[List[_]] = None,
    resourceConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty] = None,
    executionRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder)
      .image(image.orNull)
      .variables(variables.map(_.asJava).orNull)
      .resourceConfiguration(resourceConfiguration.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .build()
}
