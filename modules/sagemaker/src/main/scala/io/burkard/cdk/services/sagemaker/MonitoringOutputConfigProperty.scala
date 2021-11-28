package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringOutputConfigProperty {

  def apply(
    monitoringOutputs: List[_],
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty.Builder)
      .monitoringOutputs(monitoringOutputs.asJava)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
