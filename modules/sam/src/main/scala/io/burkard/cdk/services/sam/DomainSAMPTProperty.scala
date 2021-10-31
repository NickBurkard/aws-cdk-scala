package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainSAMPTProperty {

  def apply(
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.Builder)
      .domainName(domainName.orNull)
      .build()
}
