package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HibernationOptionsProperty {

  def apply(
    configured: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty.Builder)
      .configured(configured.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
