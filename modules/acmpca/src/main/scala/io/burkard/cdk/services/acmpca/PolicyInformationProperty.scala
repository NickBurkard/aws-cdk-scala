package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PolicyInformationProperty {

  def apply(
    certPolicyId: Option[String] = None,
    policyQualifiers: Option[List[_]] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.Builder)
      .certPolicyId(certPolicyId.orNull)
      .policyQualifiers(policyQualifiers.map(_.asJava).orNull)
      .build()
}
