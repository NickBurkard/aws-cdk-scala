package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationReferenceDataSource {

  def apply(
    internalResourceId: String,
    referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty,
    applicationName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.Builder
      .create(stackCtx, internalResourceId)
      .referenceDataSource(referenceDataSource)
      .applicationName(applicationName)
      .build()
}
