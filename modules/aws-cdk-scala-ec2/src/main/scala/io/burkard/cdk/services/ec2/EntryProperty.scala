package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EntryProperty {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty =
    (new software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .build()
}
