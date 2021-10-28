package io.burkard.cdk.services.auditmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AWSServiceProperty {

  def apply(
    serviceName: Option[String] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.Builder)
      .serviceName(serviceName.orNull)
      .build()
}
