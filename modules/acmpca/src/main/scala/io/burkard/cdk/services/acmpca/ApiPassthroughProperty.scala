package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiPassthroughProperty {

  def apply(
    subject: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty] = None,
    extensions: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty.Builder)
      .subject(subject.orNull)
      .extensions(extensions.orNull)
      .build()
}
