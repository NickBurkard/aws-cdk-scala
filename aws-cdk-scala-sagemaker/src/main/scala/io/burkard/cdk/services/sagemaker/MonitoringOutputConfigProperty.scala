package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringOutputConfigProperty {

  def apply(
    monitoringOutputs: Option[List[_]] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder)
      .monitoringOutputs(monitoringOutputs.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
