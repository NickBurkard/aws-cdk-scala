package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisioningPreferencesProperty {

  def apply(
    stackSetMaxConcurrencyCount: Option[Number] = None,
    stackSetMaxConcurrencyPercentage: Option[Number] = None,
    stackSetRegions: Option[List[String]] = None,
    stackSetFailureTolerancePercentage: Option[Number] = None,
    stackSetAccounts: Option[List[String]] = None,
    stackSetFailureToleranceCount: Option[Number] = None,
    stackSetOperationType: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder)
      .stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount.orNull)
      .stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage.orNull)
      .stackSetRegions(stackSetRegions.map(_.asJava).orNull)
      .stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage.orNull)
      .stackSetAccounts(stackSetAccounts.map(_.asJava).orNull)
      .stackSetFailureToleranceCount(stackSetFailureToleranceCount.orNull)
      .stackSetOperationType(stackSetOperationType.orNull)
      .build()
}
