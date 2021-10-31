package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IngestionWaitPolicyProperty {

  def apply(
    ingestionWaitTimeInHours: Option[Number] = None,
    waitForSpiceIngestion: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty.Builder)
      .ingestionWaitTimeInHours(ingestionWaitTimeInHours.orNull)
      .waitForSpiceIngestion(waitForSpiceIngestion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
