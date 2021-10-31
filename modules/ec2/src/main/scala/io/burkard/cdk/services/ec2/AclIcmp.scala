package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AclIcmp {

  def apply(
    code: Option[Number] = None,
    `type`: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.AclIcmp =
    (new software.amazon.awscdk.services.ec2.AclIcmp.Builder)
      .code(code.orNull)
      .`type`(`type`.orNull)
      .build()
}
