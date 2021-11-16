package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLocationProperty {

  def apply(
    applicationId: String,
    semanticVersion: String
  ): software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
    (new software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder)
      .applicationId(applicationId)
      .semanticVersion(semanticVersion)
      .build()
}
