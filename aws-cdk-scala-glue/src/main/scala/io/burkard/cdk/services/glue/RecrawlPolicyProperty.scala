package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecrawlPolicyProperty {

  def apply(
    recrawlBehavior: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.Builder)
      .recrawlBehavior(recrawlBehavior.orNull)
      .build()
}
