package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerActionProperty {

  def apply(
    image: String,
    resourceConfiguration: software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty,
    executionRoleArn: String,
    variables: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder)
      .image(image)
      .resourceConfiguration(resourceConfiguration)
      .executionRoleArn(executionRoleArn)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
