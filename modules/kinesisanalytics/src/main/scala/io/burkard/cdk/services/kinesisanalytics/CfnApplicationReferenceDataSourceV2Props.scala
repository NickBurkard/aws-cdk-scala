package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationReferenceDataSourceV2Props {

  def apply(
    referenceDataSource: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty] = None,
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder)
      .referenceDataSource(referenceDataSource.orNull)
      .applicationName(applicationName.orNull)
      .build()
}
