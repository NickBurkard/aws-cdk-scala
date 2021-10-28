package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CreditSpecificationProperty {

  def apply(
    cpuCredits: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty.Builder)
      .cpuCredits(cpuCredits.orNull)
      .build()
}
