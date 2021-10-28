package io.burkard.cdk.services.sdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainProps {

  def apply(
    description: Option[String] = None
  ): software.amazon.awscdk.services.sdb.CfnDomainProps =
    (new software.amazon.awscdk.services.sdb.CfnDomainProps.Builder)
      .description(description.orNull)
      .build()
}
