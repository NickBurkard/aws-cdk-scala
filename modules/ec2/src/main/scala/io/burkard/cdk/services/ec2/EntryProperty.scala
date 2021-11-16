package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EntryProperty {

  def apply(
    cidr: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty =
    (new software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.Builder)
      .cidr(cidr)
      .description(description.orNull)
      .build()
}
