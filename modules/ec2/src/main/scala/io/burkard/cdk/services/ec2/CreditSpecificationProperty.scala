package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreditSpecificationProperty {

  def apply(
    cpuCredits: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty.Builder)
      .cpuCredits(cpuCredits.orNull)
      .build()
}
