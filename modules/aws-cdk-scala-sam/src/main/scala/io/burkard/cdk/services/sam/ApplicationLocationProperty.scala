package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLocationProperty {

  def apply(
    applicationId: Option[String] = None,
    semanticVersion: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
    (new software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder)
      .applicationId(applicationId.orNull)
      .semanticVersion(semanticVersion.orNull)
      .build()
}
