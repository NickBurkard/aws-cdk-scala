package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CsvOutputOptionsProperty {

  def apply(
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty.Builder)
      .delimiter(delimiter.orNull)
      .build()
}
