package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationReferenceDataSourceV2Props {

  def apply(
    referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty,
    applicationName: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder)
      .referenceDataSource(referenceDataSource)
      .applicationName(applicationName)
      .build()
}
