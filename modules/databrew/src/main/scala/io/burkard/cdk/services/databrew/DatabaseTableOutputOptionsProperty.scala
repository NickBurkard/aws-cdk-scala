package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseTableOutputOptionsProperty {

  def apply(
    tableName: String,
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.Builder)
      .tableName(tableName)
      .tempDirectory(tempDirectory.orNull)
      .build()
}
