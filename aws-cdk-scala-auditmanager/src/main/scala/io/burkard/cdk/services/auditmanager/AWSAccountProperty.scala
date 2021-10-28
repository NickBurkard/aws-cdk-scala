package io.burkard.cdk.services.auditmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AWSAccountProperty {

  def apply(
    name: Option[String] = None,
    emailAddress: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.Builder)
      .name(name.orNull)
      .emailAddress(emailAddress.orNull)
      .id(id.orNull)
      .build()
}
