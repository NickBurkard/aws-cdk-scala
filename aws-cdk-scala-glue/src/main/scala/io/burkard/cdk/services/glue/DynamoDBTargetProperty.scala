package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDBTargetProperty {

  def apply(
    path: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.Builder)
      .path(path.orNull)
      .build()
}
