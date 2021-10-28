package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputFormatOptionsProperty {

  def apply(
    csv: Option[software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty.Builder)
      .csv(csv.orNull)
      .build()
}
