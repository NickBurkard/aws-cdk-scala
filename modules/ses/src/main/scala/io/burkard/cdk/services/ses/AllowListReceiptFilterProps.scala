package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AllowListReceiptFilterProps {

  def apply(
    ips: Option[List[String]] = None
  ): software.amazon.awscdk.services.ses.AllowListReceiptFilterProps =
    (new software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.Builder)
      .ips(ips.map(_.asJava).orNull)
      .build()
}
