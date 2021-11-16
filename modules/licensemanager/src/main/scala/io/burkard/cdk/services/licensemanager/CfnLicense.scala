package io.burkard.cdk.services.licensemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLicense {

  def apply(
    internalResourceId: String,
    consumptionConfiguration: software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty,
    licenseName: String,
    issuer: software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty,
    validity: software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty,
    productName: String,
    entitlements: List[_],
    homeRegion: String,
    licenseMetadata: Option[List[_]] = None,
    status: Option[String] = None,
    productSku: Option[String] = None,
    beneficiary: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.licensemanager.CfnLicense =
    software.amazon.awscdk.services.licensemanager.CfnLicense.Builder
      .create(stackCtx, internalResourceId)
      .consumptionConfiguration(consumptionConfiguration)
      .licenseName(licenseName)
      .issuer(issuer)
      .validity(validity)
      .productName(productName)
      .entitlements(entitlements.asJava)
      .homeRegion(homeRegion)
      .licenseMetadata(licenseMetadata.map(_.asJava).orNull)
      .status(status.orNull)
      .productSku(productSku.orNull)
      .beneficiary(beneficiary.orNull)
      .build()
}
