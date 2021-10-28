package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationReferenceDataSource {

  def apply(
    internalResourceId: String,
    referenceDataSource: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty] = None,
    applicationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.Builder
      .create(stackCtx, internalResourceId)
      .referenceDataSource(referenceDataSource.orNull)
      .applicationName(applicationName.orNull)
      .build()
}
