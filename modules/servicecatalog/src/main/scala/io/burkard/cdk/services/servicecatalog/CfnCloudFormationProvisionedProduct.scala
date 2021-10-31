package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCloudFormationProvisionedProduct {

  def apply(
    internalResourceId: String,
    provisionedProductName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pathName: Option[String] = None,
    pathId: Option[String] = None,
    notificationArns: Option[List[String]] = None,
    provisioningParameters: Option[List[_]] = None,
    acceptLanguage: Option[String] = None,
    productName: Option[String] = None,
    provisioningArtifactName: Option[String] = None,
    provisioningPreferences: Option[software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty] = None,
    provisioningArtifactId: Option[String] = None,
    productId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct =
    software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.Builder
      .create(stackCtx, internalResourceId)
      .provisionedProductName(provisionedProductName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .pathName(pathName.orNull)
      .pathId(pathId.orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .provisioningParameters(provisioningParameters.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productName(productName.orNull)
      .provisioningArtifactName(provisioningArtifactName.orNull)
      .provisioningPreferences(provisioningPreferences.orNull)
      .provisioningArtifactId(provisioningArtifactId.orNull)
      .productId(productId.orNull)
      .build()
}
