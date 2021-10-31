package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBTargetProperty {

  def apply(
    path: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.Builder)
      .path(path.orNull)
      .build()
}
