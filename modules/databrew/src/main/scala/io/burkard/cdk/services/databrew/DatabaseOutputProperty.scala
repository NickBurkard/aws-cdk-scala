package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseOutputProperty {

  def apply(
    glueConnectionName: String,
    databaseOptions: software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty,
    databaseOutputMode: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.Builder)
      .glueConnectionName(glueConnectionName)
      .databaseOptions(databaseOptions)
      .databaseOutputMode(databaseOutputMode.orNull)
      .build()
}
