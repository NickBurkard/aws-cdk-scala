package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WhiteListReceiptFilter {

  def apply(
    internalResourceId: String,
    ips: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.WhiteListReceiptFilter =
    software.amazon.awscdk.services.ses.WhiteListReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .ips(ips.map(_.asJava).orNull)
      .build()
}
