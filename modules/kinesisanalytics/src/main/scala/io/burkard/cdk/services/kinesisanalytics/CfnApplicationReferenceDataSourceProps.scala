package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationReferenceDataSourceProps {

  def apply(
    referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty,
    applicationName: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder)
      .referenceDataSource(referenceDataSource)
      .applicationName(applicationName)
      .build()
}
