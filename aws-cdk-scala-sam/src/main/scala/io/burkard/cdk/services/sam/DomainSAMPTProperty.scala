package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DomainSAMPTProperty {

  def apply(
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.Builder)
      .domainName(domainName.orNull)
      .build()
}
