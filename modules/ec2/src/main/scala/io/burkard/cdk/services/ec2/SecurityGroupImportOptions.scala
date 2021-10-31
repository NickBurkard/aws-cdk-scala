package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupImportOptions {

  def apply(
    mutable: Option[Boolean] = None,
    allowAllOutbound: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.SecurityGroupImportOptions =
    (new software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
