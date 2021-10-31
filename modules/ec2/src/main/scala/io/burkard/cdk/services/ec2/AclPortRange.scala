package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AclPortRange {

  def apply(
    to: Option[Number] = None,
    from: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.AclPortRange =
    (new software.amazon.awscdk.services.ec2.AclPortRange.Builder)
      .to(to.orNull)
      .from(from.orNull)
      .build()
}
