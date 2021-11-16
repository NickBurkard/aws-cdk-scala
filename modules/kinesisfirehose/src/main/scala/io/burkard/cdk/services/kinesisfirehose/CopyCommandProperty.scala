package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CopyCommandProperty {

  def apply(
    dataTableName: String,
    dataTableColumns: Option[String] = None,
    copyOptions: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder)
      .dataTableName(dataTableName)
      .dataTableColumns(dataTableColumns.orNull)
      .copyOptions(copyOptions.orNull)
      .build()
}
