package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AllowListReceiptFilter {

  def apply(
    internalResourceId: String,
    ips: List[String]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.AllowListReceiptFilter =
    software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .ips(ips.asJava)
      .build()
}
