package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseOutputProperty {

  def apply(
    glueConnectionName: Option[String] = None,
    databaseOutputMode: Option[String] = None,
    databaseOptions: Option[software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.Builder)
      .glueConnectionName(glueConnectionName.orNull)
      .databaseOutputMode(databaseOutputMode.orNull)
      .databaseOptions(databaseOptions.orNull)
      .build()
}
