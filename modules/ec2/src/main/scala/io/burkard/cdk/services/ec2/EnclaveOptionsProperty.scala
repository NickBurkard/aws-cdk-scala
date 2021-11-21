package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnclaveOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
