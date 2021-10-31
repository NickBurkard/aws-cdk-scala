package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringOutputConfigProperty {

  def apply(
    monitoringOutputs: Option[List[_]] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder)
      .monitoringOutputs(monitoringOutputs.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
