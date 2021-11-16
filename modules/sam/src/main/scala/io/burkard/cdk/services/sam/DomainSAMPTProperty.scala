package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainSAMPTProperty {

  def apply(
    domainName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.Builder)
      .domainName(domainName)
      .build()
}
