package org.gol.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gol.services.GolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Glider'", "'Blinker'", "'&&'", "'||'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'", "'Grid'", "'PopulatedCells:'", "'PredefinedPatterns:'", "'GridSize:'", "'('", "'height:'", "','", "'width:'", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGol.g"; }


    	private GolGrammarAccess grammarAccess;

    	public void setGrammarAccess(GolGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalGol.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalGol.g:54:1: ( ruleGame EOF )
            // InternalGol.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGol.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalGol.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalGol.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalGol.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalGol.g:69:3: ( rule__Game__Group__0 )
            // InternalGol.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGrid"
    // InternalGol.g:78:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGol.g:79:1: ( ruleGrid EOF )
            // InternalGol.g:80:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGol.g:87:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:91:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGol.g:92:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGol.g:92:2: ( ( rule__Grid__Group__0 ) )
            // InternalGol.g:93:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGol.g:94:3: ( rule__Grid__Group__0 )
            // InternalGol.g:94:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleGridSize"
    // InternalGol.g:103:1: entryRuleGridSize : ruleGridSize EOF ;
    public final void entryRuleGridSize() throws RecognitionException {
        try {
            // InternalGol.g:104:1: ( ruleGridSize EOF )
            // InternalGol.g:105:1: ruleGridSize EOF
            {
             before(grammarAccess.getGridSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGridSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridSize"


    // $ANTLR start "ruleGridSize"
    // InternalGol.g:112:1: ruleGridSize : ( ( rule__GridSize__Group__0 ) ) ;
    public final void ruleGridSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:116:2: ( ( ( rule__GridSize__Group__0 ) ) )
            // InternalGol.g:117:2: ( ( rule__GridSize__Group__0 ) )
            {
            // InternalGol.g:117:2: ( ( rule__GridSize__Group__0 ) )
            // InternalGol.g:118:3: ( rule__GridSize__Group__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup()); 
            // InternalGol.g:119:3: ( rule__GridSize__Group__0 )
            // InternalGol.g:119:4: rule__GridSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRulePredefinedPattern"
    // InternalGol.g:128:1: entryRulePredefinedPattern : rulePredefinedPattern EOF ;
    public final void entryRulePredefinedPattern() throws RecognitionException {
        try {
            // InternalGol.g:129:1: ( rulePredefinedPattern EOF )
            // InternalGol.g:130:1: rulePredefinedPattern EOF
            {
             before(grammarAccess.getPredefinedPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePredefinedPattern();

            state._fsp--;

             after(grammarAccess.getPredefinedPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredefinedPattern"


    // $ANTLR start "rulePredefinedPattern"
    // InternalGol.g:137:1: rulePredefinedPattern : ( ( rule__PredefinedPattern__Alternatives ) ) ;
    public final void rulePredefinedPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:141:2: ( ( ( rule__PredefinedPattern__Alternatives ) ) )
            // InternalGol.g:142:2: ( ( rule__PredefinedPattern__Alternatives ) )
            {
            // InternalGol.g:142:2: ( ( rule__PredefinedPattern__Alternatives ) )
            // InternalGol.g:143:3: ( rule__PredefinedPattern__Alternatives )
            {
             before(grammarAccess.getPredefinedPatternAccess().getAlternatives()); 
            // InternalGol.g:144:3: ( rule__PredefinedPattern__Alternatives )
            // InternalGol.g:144:4: rule__PredefinedPattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredefinedPattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredefinedPatternAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredefinedPattern"


    // $ANTLR start "entryRulePopulatedCell"
    // InternalGol.g:153:1: entryRulePopulatedCell : rulePopulatedCell EOF ;
    public final void entryRulePopulatedCell() throws RecognitionException {
        try {
            // InternalGol.g:154:1: ( rulePopulatedCell EOF )
            // InternalGol.g:155:1: rulePopulatedCell EOF
            {
             before(grammarAccess.getPopulatedCellRule()); 
            pushFollow(FOLLOW_1);
            rulePopulatedCell();

            state._fsp--;

             after(grammarAccess.getPopulatedCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePopulatedCell"


    // $ANTLR start "rulePopulatedCell"
    // InternalGol.g:162:1: rulePopulatedCell : ( ( rule__PopulatedCell__Group__0 ) ) ;
    public final void rulePopulatedCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:166:2: ( ( ( rule__PopulatedCell__Group__0 ) ) )
            // InternalGol.g:167:2: ( ( rule__PopulatedCell__Group__0 ) )
            {
            // InternalGol.g:167:2: ( ( rule__PopulatedCell__Group__0 ) )
            // InternalGol.g:168:3: ( rule__PopulatedCell__Group__0 )
            {
             before(grammarAccess.getPopulatedCellAccess().getGroup()); 
            // InternalGol.g:169:3: ( rule__PopulatedCell__Group__0 )
            // InternalGol.g:169:4: rule__PopulatedCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePopulatedCell"


    // $ANTLR start "entryRuleRules"
    // InternalGol.g:178:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalGol.g:179:1: ( ruleRules EOF )
            // InternalGol.g:180:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGol.g:187:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:191:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalGol.g:192:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalGol.g:192:2: ( ( rule__Rules__Group__0 ) )
            // InternalGol.g:193:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalGol.g:194:3: ( rule__Rules__Group__0 )
            // InternalGol.g:194:4: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleCondition"
    // InternalGol.g:203:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGol.g:204:1: ( ruleCondition EOF )
            // InternalGol.g:205:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGol.g:212:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:216:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGol.g:217:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGol.g:217:2: ( ( rule__Condition__Group__0 ) )
            // InternalGol.g:218:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGol.g:219:3: ( rule__Condition__Group__0 )
            // InternalGol.g:219:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleRule"
    // InternalGol.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGol.g:229:1: ( ruleRule EOF )
            // InternalGol.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGol.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGol.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGol.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalGol.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGol.g:244:3: ( rule__Rule__Group__0 )
            // InternalGol.g:244:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSeparator"
    // InternalGol.g:253:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalGol.g:254:1: ( ruleSeparator EOF )
            // InternalGol.g:255:1: ruleSeparator EOF
            {
             before(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getSeparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalGol.g:262:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:266:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalGol.g:267:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalGol.g:267:2: ( ( rule__Separator__Alternatives ) )
            // InternalGol.g:268:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalGol.g:269:3: ( rule__Separator__Alternatives )
            // InternalGol.g:269:4: rule__Separator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleState"
    // InternalGol.g:278:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalGol.g:279:1: ( ruleState EOF )
            // InternalGol.g:280:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGol.g:287:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:291:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalGol.g:292:2: ( ( rule__State__Alternatives ) )
            {
            // InternalGol.g:292:2: ( ( rule__State__Alternatives ) )
            // InternalGol.g:293:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalGol.g:294:3: ( rule__State__Alternatives )
            // InternalGol.g:294:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleBoolOp"
    // InternalGol.g:303:1: entryRuleBoolOp : ruleBoolOp EOF ;
    public final void entryRuleBoolOp() throws RecognitionException {
        try {
            // InternalGol.g:304:1: ( ruleBoolOp EOF )
            // InternalGol.g:305:1: ruleBoolOp EOF
            {
             before(grammarAccess.getBoolOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getBoolOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolOp"


    // $ANTLR start "ruleBoolOp"
    // InternalGol.g:312:1: ruleBoolOp : ( ( rule__BoolOp__Alternatives ) ) ;
    public final void ruleBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:316:2: ( ( ( rule__BoolOp__Alternatives ) ) )
            // InternalGol.g:317:2: ( ( rule__BoolOp__Alternatives ) )
            {
            // InternalGol.g:317:2: ( ( rule__BoolOp__Alternatives ) )
            // InternalGol.g:318:3: ( rule__BoolOp__Alternatives )
            {
             before(grammarAccess.getBoolOpAccess().getAlternatives()); 
            // InternalGol.g:319:3: ( rule__BoolOp__Alternatives )
            // InternalGol.g:319:4: rule__BoolOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOp"


    // $ANTLR start "entryRuleOutcome"
    // InternalGol.g:328:1: entryRuleOutcome : ruleOutcome EOF ;
    public final void entryRuleOutcome() throws RecognitionException {
        try {
            // InternalGol.g:329:1: ( ruleOutcome EOF )
            // InternalGol.g:330:1: ruleOutcome EOF
            {
             before(grammarAccess.getOutcomeRule()); 
            pushFollow(FOLLOW_1);
            ruleOutcome();

            state._fsp--;

             after(grammarAccess.getOutcomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutcome"


    // $ANTLR start "ruleOutcome"
    // InternalGol.g:337:1: ruleOutcome : ( ( rule__Outcome__Alternatives ) ) ;
    public final void ruleOutcome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:341:2: ( ( ( rule__Outcome__Alternatives ) ) )
            // InternalGol.g:342:2: ( ( rule__Outcome__Alternatives ) )
            {
            // InternalGol.g:342:2: ( ( rule__Outcome__Alternatives ) )
            // InternalGol.g:343:3: ( rule__Outcome__Alternatives )
            {
             before(grammarAccess.getOutcomeAccess().getAlternatives()); 
            // InternalGol.g:344:3: ( rule__Outcome__Alternatives )
            // InternalGol.g:344:4: rule__Outcome__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Outcome__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutcomeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutcome"


    // $ANTLR start "rule__PredefinedPattern__Alternatives"
    // InternalGol.g:352:1: rule__PredefinedPattern__Alternatives : ( ( 'Glider' ) | ( 'Blinker' ) );
    public final void rule__PredefinedPattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:356:1: ( ( 'Glider' ) | ( 'Blinker' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGol.g:357:2: ( 'Glider' )
                    {
                    // InternalGol.g:357:2: ( 'Glider' )
                    // InternalGol.g:358:3: 'Glider'
                    {
                     before(grammarAccess.getPredefinedPatternAccess().getGliderKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPredefinedPatternAccess().getGliderKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:363:2: ( 'Blinker' )
                    {
                    // InternalGol.g:363:2: ( 'Blinker' )
                    // InternalGol.g:364:3: 'Blinker'
                    {
                     before(grammarAccess.getPredefinedPatternAccess().getBlinkerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPredefinedPatternAccess().getBlinkerKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredefinedPattern__Alternatives"


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalGol.g:373:1: rule__Separator__Alternatives : ( ( '&&' ) | ( '||' ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:377:1: ( ( '&&' ) | ( '||' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGol.g:378:2: ( '&&' )
                    {
                    // InternalGol.g:378:2: ( '&&' )
                    // InternalGol.g:379:3: '&&'
                    {
                     before(grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:384:2: ( '||' )
                    {
                    // InternalGol.g:384:2: ( '||' )
                    // InternalGol.g:385:3: '||'
                    {
                     before(grammarAccess.getSeparatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Alternatives"


    // $ANTLR start "rule__State__Alternatives"
    // InternalGol.g:394:1: rule__State__Alternatives : ( ( 'living' ) | ( 'dead' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:398:1: ( ( 'living' ) | ( 'dead' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGol.g:399:2: ( 'living' )
                    {
                    // InternalGol.g:399:2: ( 'living' )
                    // InternalGol.g:400:3: 'living'
                    {
                     before(grammarAccess.getStateAccess().getLivingKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getLivingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:405:2: ( 'dead' )
                    {
                    // InternalGol.g:405:2: ( 'dead' )
                    // InternalGol.g:406:3: 'dead'
                    {
                     before(grammarAccess.getStateAccess().getDeadKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getDeadKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__BoolOp__Alternatives"
    // InternalGol.g:415:1: rule__BoolOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:419:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGol.g:420:2: ( '>' )
                    {
                    // InternalGol.g:420:2: ( '>' )
                    // InternalGol.g:421:3: '>'
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:426:2: ( '<' )
                    {
                    // InternalGol.g:426:2: ( '<' )
                    // InternalGol.g:427:3: '<'
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGol.g:432:2: ( '>=' )
                    {
                    // InternalGol.g:432:2: ( '>=' )
                    // InternalGol.g:433:3: '>='
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGol.g:438:2: ( '<=' )
                    {
                    // InternalGol.g:438:2: ( '<=' )
                    // InternalGol.g:439:3: '<='
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGol.g:444:2: ( '==' )
                    {
                    // InternalGol.g:444:2: ( '==' )
                    // InternalGol.g:445:3: '=='
                    {
                     before(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOp__Alternatives"


    // $ANTLR start "rule__Outcome__Alternatives"
    // InternalGol.g:454:1: rule__Outcome__Alternatives : ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) );
    public final void rule__Outcome__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:458:1: ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGol.g:459:2: ( 'survives' )
                    {
                    // InternalGol.g:459:2: ( 'survives' )
                    // InternalGol.g:460:3: 'survives'
                    {
                     before(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:465:2: ( 'dies' )
                    {
                    // InternalGol.g:465:2: ( 'dies' )
                    // InternalGol.g:466:3: 'dies'
                    {
                     before(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGol.g:471:2: ( 'populates' )
                    {
                    // InternalGol.g:471:2: ( 'populates' )
                    // InternalGol.g:472:3: 'populates'
                    {
                     before(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outcome__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalGol.g:481:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:485:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGol.g:486:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalGol.g:493:1: rule__Game__Group__0__Impl : ( ( rule__Game__GridAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:497:1: ( ( ( rule__Game__GridAssignment_0 ) ) )
            // InternalGol.g:498:1: ( ( rule__Game__GridAssignment_0 ) )
            {
            // InternalGol.g:498:1: ( ( rule__Game__GridAssignment_0 ) )
            // InternalGol.g:499:2: ( rule__Game__GridAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getGridAssignment_0()); 
            // InternalGol.g:500:2: ( rule__Game__GridAssignment_0 )
            // InternalGol.g:500:3: rule__Game__GridAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Game__GridAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGridAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalGol.g:508:1: rule__Game__Group__1 : rule__Game__Group__1__Impl ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:512:1: ( rule__Game__Group__1__Impl )
            // InternalGol.g:513:2: rule__Game__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalGol.g:519:1: rule__Game__Group__1__Impl : ( ( rule__Game__RulesAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:523:1: ( ( ( rule__Game__RulesAssignment_1 ) ) )
            // InternalGol.g:524:1: ( ( rule__Game__RulesAssignment_1 ) )
            {
            // InternalGol.g:524:1: ( ( rule__Game__RulesAssignment_1 ) )
            // InternalGol.g:525:2: ( rule__Game__RulesAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_1()); 
            // InternalGol.g:526:2: ( rule__Game__RulesAssignment_1 )
            // InternalGol.g:526:3: rule__Game__RulesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGol.g:535:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:539:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGol.g:540:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGol.g:547:1: rule__Grid__Group__0__Impl : ( () ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:551:1: ( ( () ) )
            // InternalGol.g:552:1: ( () )
            {
            // InternalGol.g:552:1: ( () )
            // InternalGol.g:553:2: ()
            {
             before(grammarAccess.getGridAccess().getGridAction_0()); 
            // InternalGol.g:554:2: ()
            // InternalGol.g:554:3: 
            {
            }

             after(grammarAccess.getGridAccess().getGridAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGol.g:562:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:566:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGol.g:567:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGol.g:574:1: rule__Grid__Group__1__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:578:1: ( ( 'Grid' ) )
            // InternalGol.g:579:1: ( 'Grid' )
            {
            // InternalGol.g:579:1: ( 'Grid' )
            // InternalGol.g:580:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGol.g:589:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:593:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGol.g:594:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGol.g:601:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__SizeAssignment_2 ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:605:1: ( ( ( rule__Grid__SizeAssignment_2 ) ) )
            // InternalGol.g:606:1: ( ( rule__Grid__SizeAssignment_2 ) )
            {
            // InternalGol.g:606:1: ( ( rule__Grid__SizeAssignment_2 ) )
            // InternalGol.g:607:2: ( rule__Grid__SizeAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_2()); 
            // InternalGol.g:608:2: ( rule__Grid__SizeAssignment_2 )
            // InternalGol.g:608:3: rule__Grid__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Grid__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGol.g:616:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl rule__Grid__Group__4 ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:620:1: ( rule__Grid__Group__3__Impl rule__Grid__Group__4 )
            // InternalGol.g:621:2: rule__Grid__Group__3__Impl rule__Grid__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGol.g:628:1: rule__Grid__Group__3__Impl : ( 'PopulatedCells:' ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:632:1: ( ( 'PopulatedCells:' ) )
            // InternalGol.g:633:1: ( 'PopulatedCells:' )
            {
            // InternalGol.g:633:1: ( 'PopulatedCells:' )
            // InternalGol.g:634:2: 'PopulatedCells:'
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getPopulatedCellsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Grid__Group__4"
    // InternalGol.g:643:1: rule__Grid__Group__4 : rule__Grid__Group__4__Impl rule__Grid__Group__5 ;
    public final void rule__Grid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:647:1: ( rule__Grid__Group__4__Impl rule__Grid__Group__5 )
            // InternalGol.g:648:2: rule__Grid__Group__4__Impl rule__Grid__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4"


    // $ANTLR start "rule__Grid__Group__4__Impl"
    // InternalGol.g:655:1: rule__Grid__Group__4__Impl : ( ( rule__Grid__PopulatedCellsAssignment_4 )* ) ;
    public final void rule__Grid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:659:1: ( ( ( rule__Grid__PopulatedCellsAssignment_4 )* ) )
            // InternalGol.g:660:1: ( ( rule__Grid__PopulatedCellsAssignment_4 )* )
            {
            // InternalGol.g:660:1: ( ( rule__Grid__PopulatedCellsAssignment_4 )* )
            // InternalGol.g:661:2: ( rule__Grid__PopulatedCellsAssignment_4 )*
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsAssignment_4()); 
            // InternalGol.g:662:2: ( rule__Grid__PopulatedCellsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGol.g:662:3: rule__Grid__PopulatedCellsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Grid__PopulatedCellsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getPopulatedCellsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4__Impl"


    // $ANTLR start "rule__Grid__Group__5"
    // InternalGol.g:670:1: rule__Grid__Group__5 : rule__Grid__Group__5__Impl ;
    public final void rule__Grid__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:674:1: ( rule__Grid__Group__5__Impl )
            // InternalGol.g:675:2: rule__Grid__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__5"


    // $ANTLR start "rule__Grid__Group__5__Impl"
    // InternalGol.g:681:1: rule__Grid__Group__5__Impl : ( ( rule__Grid__Group_5__0 )? ) ;
    public final void rule__Grid__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:685:1: ( ( ( rule__Grid__Group_5__0 )? ) )
            // InternalGol.g:686:1: ( ( rule__Grid__Group_5__0 )? )
            {
            // InternalGol.g:686:1: ( ( rule__Grid__Group_5__0 )? )
            // InternalGol.g:687:2: ( rule__Grid__Group_5__0 )?
            {
             before(grammarAccess.getGridAccess().getGroup_5()); 
            // InternalGol.g:688:2: ( rule__Grid__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGol.g:688:3: rule__Grid__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Grid__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGridAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__5__Impl"


    // $ANTLR start "rule__Grid__Group_5__0"
    // InternalGol.g:697:1: rule__Grid__Group_5__0 : rule__Grid__Group_5__0__Impl rule__Grid__Group_5__1 ;
    public final void rule__Grid__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:701:1: ( rule__Grid__Group_5__0__Impl rule__Grid__Group_5__1 )
            // InternalGol.g:702:2: rule__Grid__Group_5__0__Impl rule__Grid__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Grid__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_5__0"


    // $ANTLR start "rule__Grid__Group_5__0__Impl"
    // InternalGol.g:709:1: rule__Grid__Group_5__0__Impl : ( 'PredefinedPatterns:' ) ;
    public final void rule__Grid__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:713:1: ( ( 'PredefinedPatterns:' ) )
            // InternalGol.g:714:1: ( 'PredefinedPatterns:' )
            {
            // InternalGol.g:714:1: ( 'PredefinedPatterns:' )
            // InternalGol.g:715:2: 'PredefinedPatterns:'
            {
             before(grammarAccess.getGridAccess().getPredefinedPatternsKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getPredefinedPatternsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_5__0__Impl"


    // $ANTLR start "rule__Grid__Group_5__1"
    // InternalGol.g:724:1: rule__Grid__Group_5__1 : rule__Grid__Group_5__1__Impl ;
    public final void rule__Grid__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:728:1: ( rule__Grid__Group_5__1__Impl )
            // InternalGol.g:729:2: rule__Grid__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_5__1"


    // $ANTLR start "rule__Grid__Group_5__1__Impl"
    // InternalGol.g:735:1: rule__Grid__Group_5__1__Impl : ( ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) ) ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* ) ) ;
    public final void rule__Grid__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:739:1: ( ( ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) ) ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* ) ) )
            // InternalGol.g:740:1: ( ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) ) ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* ) )
            {
            // InternalGol.g:740:1: ( ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) ) ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* ) )
            // InternalGol.g:741:2: ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) ) ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* )
            {
            // InternalGol.g:741:2: ( ( rule__Grid__PredefinedPatternsAssignment_5_1 ) )
            // InternalGol.g:742:3: ( rule__Grid__PredefinedPatternsAssignment_5_1 )
            {
             before(grammarAccess.getGridAccess().getPredefinedPatternsAssignment_5_1()); 
            // InternalGol.g:743:3: ( rule__Grid__PredefinedPatternsAssignment_5_1 )
            // InternalGol.g:743:4: rule__Grid__PredefinedPatternsAssignment_5_1
            {
            pushFollow(FOLLOW_10);
            rule__Grid__PredefinedPatternsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getPredefinedPatternsAssignment_5_1()); 

            }

            // InternalGol.g:746:2: ( ( rule__Grid__PredefinedPatternsAssignment_5_1 )* )
            // InternalGol.g:747:3: ( rule__Grid__PredefinedPatternsAssignment_5_1 )*
            {
             before(grammarAccess.getGridAccess().getPredefinedPatternsAssignment_5_1()); 
            // InternalGol.g:748:3: ( rule__Grid__PredefinedPatternsAssignment_5_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGol.g:748:4: rule__Grid__PredefinedPatternsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Grid__PredefinedPatternsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getPredefinedPatternsAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group_5__1__Impl"


    // $ANTLR start "rule__GridSize__Group__0"
    // InternalGol.g:758:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:762:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalGol.g:763:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GridSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0"


    // $ANTLR start "rule__GridSize__Group__0__Impl"
    // InternalGol.g:770:1: rule__GridSize__Group__0__Impl : ( () ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:774:1: ( ( () ) )
            // InternalGol.g:775:1: ( () )
            {
            // InternalGol.g:775:1: ( () )
            // InternalGol.g:776:2: ()
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 
            // InternalGol.g:777:2: ()
            // InternalGol.g:777:3: 
            {
            }

             after(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0__Impl"


    // $ANTLR start "rule__GridSize__Group__1"
    // InternalGol.g:785:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:789:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalGol.g:790:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GridSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1"


    // $ANTLR start "rule__GridSize__Group__1__Impl"
    // InternalGol.g:797:1: rule__GridSize__Group__1__Impl : ( 'GridSize:' ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:801:1: ( ( 'GridSize:' ) )
            // InternalGol.g:802:1: ( 'GridSize:' )
            {
            // InternalGol.g:802:1: ( 'GridSize:' )
            // InternalGol.g:803:2: 'GridSize:'
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1__Impl"


    // $ANTLR start "rule__GridSize__Group__2"
    // InternalGol.g:812:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl rule__GridSize__Group__3 ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:816:1: ( rule__GridSize__Group__2__Impl rule__GridSize__Group__3 )
            // InternalGol.g:817:2: rule__GridSize__Group__2__Impl rule__GridSize__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GridSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2"


    // $ANTLR start "rule__GridSize__Group__2__Impl"
    // InternalGol.g:824:1: rule__GridSize__Group__2__Impl : ( '(' ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:828:1: ( ( '(' ) )
            // InternalGol.g:829:1: ( '(' )
            {
            // InternalGol.g:829:1: ( '(' )
            // InternalGol.g:830:2: '('
            {
             before(grammarAccess.getGridSizeAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2__Impl"


    // $ANTLR start "rule__GridSize__Group__3"
    // InternalGol.g:839:1: rule__GridSize__Group__3 : rule__GridSize__Group__3__Impl rule__GridSize__Group__4 ;
    public final void rule__GridSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:843:1: ( rule__GridSize__Group__3__Impl rule__GridSize__Group__4 )
            // InternalGol.g:844:2: rule__GridSize__Group__3__Impl rule__GridSize__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__GridSize__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__3"


    // $ANTLR start "rule__GridSize__Group__3__Impl"
    // InternalGol.g:851:1: rule__GridSize__Group__3__Impl : ( 'height:' ) ;
    public final void rule__GridSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:855:1: ( ( 'height:' ) )
            // InternalGol.g:856:1: ( 'height:' )
            {
            // InternalGol.g:856:1: ( 'height:' )
            // InternalGol.g:857:2: 'height:'
            {
             before(grammarAccess.getGridSizeAccess().getHeightKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHeightKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__3__Impl"


    // $ANTLR start "rule__GridSize__Group__4"
    // InternalGol.g:866:1: rule__GridSize__Group__4 : rule__GridSize__Group__4__Impl rule__GridSize__Group__5 ;
    public final void rule__GridSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:870:1: ( rule__GridSize__Group__4__Impl rule__GridSize__Group__5 )
            // InternalGol.g:871:2: rule__GridSize__Group__4__Impl rule__GridSize__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__GridSize__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__4"


    // $ANTLR start "rule__GridSize__Group__4__Impl"
    // InternalGol.g:878:1: rule__GridSize__Group__4__Impl : ( ( rule__GridSize__HeightAssignment_4 ) ) ;
    public final void rule__GridSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:882:1: ( ( ( rule__GridSize__HeightAssignment_4 ) ) )
            // InternalGol.g:883:1: ( ( rule__GridSize__HeightAssignment_4 ) )
            {
            // InternalGol.g:883:1: ( ( rule__GridSize__HeightAssignment_4 ) )
            // InternalGol.g:884:2: ( rule__GridSize__HeightAssignment_4 )
            {
             before(grammarAccess.getGridSizeAccess().getHeightAssignment_4()); 
            // InternalGol.g:885:2: ( rule__GridSize__HeightAssignment_4 )
            // InternalGol.g:885:3: rule__GridSize__HeightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__HeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getHeightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__4__Impl"


    // $ANTLR start "rule__GridSize__Group__5"
    // InternalGol.g:893:1: rule__GridSize__Group__5 : rule__GridSize__Group__5__Impl rule__GridSize__Group__6 ;
    public final void rule__GridSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:897:1: ( rule__GridSize__Group__5__Impl rule__GridSize__Group__6 )
            // InternalGol.g:898:2: rule__GridSize__Group__5__Impl rule__GridSize__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__GridSize__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__5"


    // $ANTLR start "rule__GridSize__Group__5__Impl"
    // InternalGol.g:905:1: rule__GridSize__Group__5__Impl : ( ',' ) ;
    public final void rule__GridSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:909:1: ( ( ',' ) )
            // InternalGol.g:910:1: ( ',' )
            {
            // InternalGol.g:910:1: ( ',' )
            // InternalGol.g:911:2: ','
            {
             before(grammarAccess.getGridSizeAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__5__Impl"


    // $ANTLR start "rule__GridSize__Group__6"
    // InternalGol.g:920:1: rule__GridSize__Group__6 : rule__GridSize__Group__6__Impl rule__GridSize__Group__7 ;
    public final void rule__GridSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:924:1: ( rule__GridSize__Group__6__Impl rule__GridSize__Group__7 )
            // InternalGol.g:925:2: rule__GridSize__Group__6__Impl rule__GridSize__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__GridSize__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__6"


    // $ANTLR start "rule__GridSize__Group__6__Impl"
    // InternalGol.g:932:1: rule__GridSize__Group__6__Impl : ( 'width:' ) ;
    public final void rule__GridSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:936:1: ( ( 'width:' ) )
            // InternalGol.g:937:1: ( 'width:' )
            {
            // InternalGol.g:937:1: ( 'width:' )
            // InternalGol.g:938:2: 'width:'
            {
             before(grammarAccess.getGridSizeAccess().getWidthKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getWidthKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__6__Impl"


    // $ANTLR start "rule__GridSize__Group__7"
    // InternalGol.g:947:1: rule__GridSize__Group__7 : rule__GridSize__Group__7__Impl rule__GridSize__Group__8 ;
    public final void rule__GridSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:951:1: ( rule__GridSize__Group__7__Impl rule__GridSize__Group__8 )
            // InternalGol.g:952:2: rule__GridSize__Group__7__Impl rule__GridSize__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__GridSize__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__7"


    // $ANTLR start "rule__GridSize__Group__7__Impl"
    // InternalGol.g:959:1: rule__GridSize__Group__7__Impl : ( ( rule__GridSize__WidthAssignment_7 ) ) ;
    public final void rule__GridSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:963:1: ( ( ( rule__GridSize__WidthAssignment_7 ) ) )
            // InternalGol.g:964:1: ( ( rule__GridSize__WidthAssignment_7 ) )
            {
            // InternalGol.g:964:1: ( ( rule__GridSize__WidthAssignment_7 ) )
            // InternalGol.g:965:2: ( rule__GridSize__WidthAssignment_7 )
            {
             before(grammarAccess.getGridSizeAccess().getWidthAssignment_7()); 
            // InternalGol.g:966:2: ( rule__GridSize__WidthAssignment_7 )
            // InternalGol.g:966:3: rule__GridSize__WidthAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__WidthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getWidthAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__7__Impl"


    // $ANTLR start "rule__GridSize__Group__8"
    // InternalGol.g:974:1: rule__GridSize__Group__8 : rule__GridSize__Group__8__Impl ;
    public final void rule__GridSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:978:1: ( rule__GridSize__Group__8__Impl )
            // InternalGol.g:979:2: rule__GridSize__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__8"


    // $ANTLR start "rule__GridSize__Group__8__Impl"
    // InternalGol.g:985:1: rule__GridSize__Group__8__Impl : ( ')' ) ;
    public final void rule__GridSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:989:1: ( ( ')' ) )
            // InternalGol.g:990:1: ( ')' )
            {
            // InternalGol.g:990:1: ( ')' )
            // InternalGol.g:991:2: ')'
            {
             before(grammarAccess.getGridSizeAccess().getRightParenthesisKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__8__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__0"
    // InternalGol.g:1001:1: rule__PopulatedCell__Group__0 : rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 ;
    public final void rule__PopulatedCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1005:1: ( rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 )
            // InternalGol.g:1006:2: rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PopulatedCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__0"


    // $ANTLR start "rule__PopulatedCell__Group__0__Impl"
    // InternalGol.g:1013:1: rule__PopulatedCell__Group__0__Impl : ( '(' ) ;
    public final void rule__PopulatedCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1017:1: ( ( '(' ) )
            // InternalGol.g:1018:1: ( '(' )
            {
            // InternalGol.g:1018:1: ( '(' )
            // InternalGol.g:1019:2: '('
            {
             before(grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__0__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__1"
    // InternalGol.g:1028:1: rule__PopulatedCell__Group__1 : rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2 ;
    public final void rule__PopulatedCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1032:1: ( rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2 )
            // InternalGol.g:1033:2: rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PopulatedCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__1"


    // $ANTLR start "rule__PopulatedCell__Group__1__Impl"
    // InternalGol.g:1040:1: rule__PopulatedCell__Group__1__Impl : ( ( rule__PopulatedCell__XAssignment_1 ) ) ;
    public final void rule__PopulatedCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1044:1: ( ( ( rule__PopulatedCell__XAssignment_1 ) ) )
            // InternalGol.g:1045:1: ( ( rule__PopulatedCell__XAssignment_1 ) )
            {
            // InternalGol.g:1045:1: ( ( rule__PopulatedCell__XAssignment_1 ) )
            // InternalGol.g:1046:2: ( rule__PopulatedCell__XAssignment_1 )
            {
             before(grammarAccess.getPopulatedCellAccess().getXAssignment_1()); 
            // InternalGol.g:1047:2: ( rule__PopulatedCell__XAssignment_1 )
            // InternalGol.g:1047:3: rule__PopulatedCell__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__1__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__2"
    // InternalGol.g:1055:1: rule__PopulatedCell__Group__2 : rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3 ;
    public final void rule__PopulatedCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1059:1: ( rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3 )
            // InternalGol.g:1060:2: rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PopulatedCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__2"


    // $ANTLR start "rule__PopulatedCell__Group__2__Impl"
    // InternalGol.g:1067:1: rule__PopulatedCell__Group__2__Impl : ( ',' ) ;
    public final void rule__PopulatedCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1071:1: ( ( ',' ) )
            // InternalGol.g:1072:1: ( ',' )
            {
            // InternalGol.g:1072:1: ( ',' )
            // InternalGol.g:1073:2: ','
            {
             before(grammarAccess.getPopulatedCellAccess().getCommaKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__2__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__3"
    // InternalGol.g:1082:1: rule__PopulatedCell__Group__3 : rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4 ;
    public final void rule__PopulatedCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1086:1: ( rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4 )
            // InternalGol.g:1087:2: rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__PopulatedCell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__3"


    // $ANTLR start "rule__PopulatedCell__Group__3__Impl"
    // InternalGol.g:1094:1: rule__PopulatedCell__Group__3__Impl : ( ( rule__PopulatedCell__YAssignment_3 ) ) ;
    public final void rule__PopulatedCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1098:1: ( ( ( rule__PopulatedCell__YAssignment_3 ) ) )
            // InternalGol.g:1099:1: ( ( rule__PopulatedCell__YAssignment_3 ) )
            {
            // InternalGol.g:1099:1: ( ( rule__PopulatedCell__YAssignment_3 ) )
            // InternalGol.g:1100:2: ( rule__PopulatedCell__YAssignment_3 )
            {
             before(grammarAccess.getPopulatedCellAccess().getYAssignment_3()); 
            // InternalGol.g:1101:2: ( rule__PopulatedCell__YAssignment_3 )
            // InternalGol.g:1101:3: rule__PopulatedCell__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__3__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__4"
    // InternalGol.g:1109:1: rule__PopulatedCell__Group__4 : rule__PopulatedCell__Group__4__Impl ;
    public final void rule__PopulatedCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1113:1: ( rule__PopulatedCell__Group__4__Impl )
            // InternalGol.g:1114:2: rule__PopulatedCell__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__4"


    // $ANTLR start "rule__PopulatedCell__Group__4__Impl"
    // InternalGol.g:1120:1: rule__PopulatedCell__Group__4__Impl : ( ')' ) ;
    public final void rule__PopulatedCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1124:1: ( ( ')' ) )
            // InternalGol.g:1125:1: ( ')' )
            {
            // InternalGol.g:1125:1: ( ')' )
            // InternalGol.g:1126:2: ')'
            {
             before(grammarAccess.getPopulatedCellAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // InternalGol.g:1136:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1140:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalGol.g:1141:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // InternalGol.g:1148:1: rule__Rules__Group__0__Impl : ( () ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1152:1: ( ( () ) )
            // InternalGol.g:1153:1: ( () )
            {
            // InternalGol.g:1153:1: ( () )
            // InternalGol.g:1154:2: ()
            {
             before(grammarAccess.getRulesAccess().getRulesAction_0()); 
            // InternalGol.g:1155:2: ()
            // InternalGol.g:1155:3: 
            {
            }

             after(grammarAccess.getRulesAccess().getRulesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // InternalGol.g:1163:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1167:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalGol.g:1168:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // InternalGol.g:1175:1: rule__Rules__Group__1__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1179:1: ( ( 'Rules' ) )
            // InternalGol.g:1180:1: ( 'Rules' )
            {
            // InternalGol.g:1180:1: ( 'Rules' )
            // InternalGol.g:1181:2: 'Rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // InternalGol.g:1190:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1194:1: ( rule__Rules__Group__2__Impl )
            // InternalGol.g:1195:2: rule__Rules__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // InternalGol.g:1201:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__RulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1205:1: ( ( ( rule__Rules__RulesAssignment_2 )* ) )
            // InternalGol.g:1206:1: ( ( rule__Rules__RulesAssignment_2 )* )
            {
            // InternalGol.g:1206:1: ( ( rule__Rules__RulesAssignment_2 )* )
            // InternalGol.g:1207:2: ( rule__Rules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getRulesAssignment_2()); 
            // InternalGol.g:1208:2: ( rule__Rules__RulesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGol.g:1208:3: rule__Rules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Rules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGol.g:1217:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1221:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGol.g:1222:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGol.g:1229:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__BoolOpAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1233:1: ( ( ( rule__Condition__BoolOpAssignment_0 ) ) )
            // InternalGol.g:1234:1: ( ( rule__Condition__BoolOpAssignment_0 ) )
            {
            // InternalGol.g:1234:1: ( ( rule__Condition__BoolOpAssignment_0 ) )
            // InternalGol.g:1235:2: ( rule__Condition__BoolOpAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); 
            // InternalGol.g:1236:2: ( rule__Condition__BoolOpAssignment_0 )
            // InternalGol.g:1236:3: rule__Condition__BoolOpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__BoolOpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGol.g:1244:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1248:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGol.g:1249:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGol.g:1256:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NCountAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1260:1: ( ( ( rule__Condition__NCountAssignment_1 ) ) )
            // InternalGol.g:1261:1: ( ( rule__Condition__NCountAssignment_1 ) )
            {
            // InternalGol.g:1261:1: ( ( rule__Condition__NCountAssignment_1 ) )
            // InternalGol.g:1262:2: ( rule__Condition__NCountAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNCountAssignment_1()); 
            // InternalGol.g:1263:2: ( rule__Condition__NCountAssignment_1 )
            // InternalGol.g:1263:3: rule__Condition__NCountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NCountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGol.g:1271:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1275:1: ( rule__Condition__Group__2__Impl )
            // InternalGol.g:1276:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGol.g:1282:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__SeparatorAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1286:1: ( ( ( rule__Condition__SeparatorAssignment_2 )? ) )
            // InternalGol.g:1287:1: ( ( rule__Condition__SeparatorAssignment_2 )? )
            {
            // InternalGol.g:1287:1: ( ( rule__Condition__SeparatorAssignment_2 )? )
            // InternalGol.g:1288:2: ( rule__Condition__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getConditionAccess().getSeparatorAssignment_2()); 
            // InternalGol.g:1289:2: ( rule__Condition__SeparatorAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGol.g:1289:3: rule__Condition__SeparatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__SeparatorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getSeparatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGol.g:1298:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1302:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGol.g:1303:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGol.g:1310:1: rule__Rule__Group__0__Impl : ( 'Each' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1314:1: ( ( 'Each' ) )
            // InternalGol.g:1315:1: ( 'Each' )
            {
            // InternalGol.g:1315:1: ( 'Each' )
            // InternalGol.g:1316:2: 'Each'
            {
             before(grammarAccess.getRuleAccess().getEachKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGol.g:1325:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1329:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGol.g:1330:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGol.g:1337:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__StateAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1341:1: ( ( ( rule__Rule__StateAssignment_1 ) ) )
            // InternalGol.g:1342:1: ( ( rule__Rule__StateAssignment_1 ) )
            {
            // InternalGol.g:1342:1: ( ( rule__Rule__StateAssignment_1 ) )
            // InternalGol.g:1343:2: ( rule__Rule__StateAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_1()); 
            // InternalGol.g:1344:2: ( rule__Rule__StateAssignment_1 )
            // InternalGol.g:1344:3: rule__Rule__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGol.g:1352:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1356:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGol.g:1357:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGol.g:1364:1: rule__Rule__Group__2__Impl : ( 'cell' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1368:1: ( ( 'cell' ) )
            // InternalGol.g:1369:1: ( 'cell' )
            {
            // InternalGol.g:1369:1: ( 'cell' )
            // InternalGol.g:1370:2: 'cell'
            {
             before(grammarAccess.getRuleAccess().getCellKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCellKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGol.g:1379:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1383:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGol.g:1384:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGol.g:1391:1: rule__Rule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1395:1: ( ( 'with' ) )
            // InternalGol.g:1396:1: ( 'with' )
            {
            // InternalGol.g:1396:1: ( 'with' )
            // InternalGol.g:1397:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalGol.g:1406:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1410:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalGol.g:1411:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalGol.g:1418:1: rule__Rule__Group__4__Impl : ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1422:1: ( ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) )
            // InternalGol.g:1423:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            {
            // InternalGol.g:1423:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            // InternalGol.g:1424:2: ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* )
            {
            // InternalGol.g:1424:2: ( ( rule__Rule__ConditionsAssignment_4 ) )
            // InternalGol.g:1425:3: ( rule__Rule__ConditionsAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalGol.g:1426:3: ( rule__Rule__ConditionsAssignment_4 )
            // InternalGol.g:1426:4: rule__Rule__ConditionsAssignment_4
            {
            pushFollow(FOLLOW_25);
            rule__Rule__ConditionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 

            }

            // InternalGol.g:1429:2: ( ( rule__Rule__ConditionsAssignment_4 )* )
            // InternalGol.g:1430:3: ( rule__Rule__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalGol.g:1431:3: ( rule__Rule__ConditionsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=17 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGol.g:1431:4: rule__Rule__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalGol.g:1440:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1444:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalGol.g:1445:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalGol.g:1452:1: rule__Rule__Group__5__Impl : ( 'neighbors' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1456:1: ( ( 'neighbors' ) )
            // InternalGol.g:1457:1: ( 'neighbors' )
            {
            // InternalGol.g:1457:1: ( 'neighbors' )
            // InternalGol.g:1458:2: 'neighbors'
            {
             before(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalGol.g:1467:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1471:1: ( rule__Rule__Group__6__Impl )
            // InternalGol.g:1472:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalGol.g:1478:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ResultAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1482:1: ( ( ( rule__Rule__ResultAssignment_6 ) ) )
            // InternalGol.g:1483:1: ( ( rule__Rule__ResultAssignment_6 ) )
            {
            // InternalGol.g:1483:1: ( ( rule__Rule__ResultAssignment_6 ) )
            // InternalGol.g:1484:2: ( rule__Rule__ResultAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getResultAssignment_6()); 
            // InternalGol.g:1485:2: ( rule__Rule__ResultAssignment_6 )
            // InternalGol.g:1485:3: rule__Rule__ResultAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResultAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResultAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Game__GridAssignment_0"
    // InternalGol.g:1494:1: rule__Game__GridAssignment_0 : ( ruleGrid ) ;
    public final void rule__Game__GridAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1498:1: ( ( ruleGrid ) )
            // InternalGol.g:1499:2: ( ruleGrid )
            {
            // InternalGol.g:1499:2: ( ruleGrid )
            // InternalGol.g:1500:3: ruleGrid
            {
             before(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GridAssignment_0"


    // $ANTLR start "rule__Game__RulesAssignment_1"
    // InternalGol.g:1509:1: rule__Game__RulesAssignment_1 : ( ruleRules ) ;
    public final void rule__Game__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1513:1: ( ( ruleRules ) )
            // InternalGol.g:1514:2: ( ruleRules )
            {
            // InternalGol.g:1514:2: ( ruleRules )
            // InternalGol.g:1515:3: ruleRules
            {
             before(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__RulesAssignment_1"


    // $ANTLR start "rule__Grid__SizeAssignment_2"
    // InternalGol.g:1524:1: rule__Grid__SizeAssignment_2 : ( ruleGridSize ) ;
    public final void rule__Grid__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1528:1: ( ( ruleGridSize ) )
            // InternalGol.g:1529:2: ( ruleGridSize )
            {
            // InternalGol.g:1529:2: ( ruleGridSize )
            // InternalGol.g:1530:3: ruleGridSize
            {
             before(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__SizeAssignment_2"


    // $ANTLR start "rule__Grid__PopulatedCellsAssignment_4"
    // InternalGol.g:1539:1: rule__Grid__PopulatedCellsAssignment_4 : ( rulePopulatedCell ) ;
    public final void rule__Grid__PopulatedCellsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1543:1: ( ( rulePopulatedCell ) )
            // InternalGol.g:1544:2: ( rulePopulatedCell )
            {
            // InternalGol.g:1544:2: ( rulePopulatedCell )
            // InternalGol.g:1545:3: rulePopulatedCell
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePopulatedCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__PopulatedCellsAssignment_4"


    // $ANTLR start "rule__Grid__PredefinedPatternsAssignment_5_1"
    // InternalGol.g:1554:1: rule__Grid__PredefinedPatternsAssignment_5_1 : ( rulePredefinedPattern ) ;
    public final void rule__Grid__PredefinedPatternsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1558:1: ( ( rulePredefinedPattern ) )
            // InternalGol.g:1559:2: ( rulePredefinedPattern )
            {
            // InternalGol.g:1559:2: ( rulePredefinedPattern )
            // InternalGol.g:1560:3: rulePredefinedPattern
            {
             before(grammarAccess.getGridAccess().getPredefinedPatternsPredefinedPatternParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredefinedPattern();

            state._fsp--;

             after(grammarAccess.getGridAccess().getPredefinedPatternsPredefinedPatternParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__PredefinedPatternsAssignment_5_1"


    // $ANTLR start "rule__GridSize__HeightAssignment_4"
    // InternalGol.g:1569:1: rule__GridSize__HeightAssignment_4 : ( RULE_INT ) ;
    public final void rule__GridSize__HeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1573:1: ( ( RULE_INT ) )
            // InternalGol.g:1574:2: ( RULE_INT )
            {
            // InternalGol.g:1574:2: ( RULE_INT )
            // InternalGol.g:1575:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__HeightAssignment_4"


    // $ANTLR start "rule__GridSize__WidthAssignment_7"
    // InternalGol.g:1584:1: rule__GridSize__WidthAssignment_7 : ( RULE_INT ) ;
    public final void rule__GridSize__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1588:1: ( ( RULE_INT ) )
            // InternalGol.g:1589:2: ( RULE_INT )
            {
            // InternalGol.g:1589:2: ( RULE_INT )
            // InternalGol.g:1590:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__WidthAssignment_7"


    // $ANTLR start "rule__PopulatedCell__XAssignment_1"
    // InternalGol.g:1599:1: rule__PopulatedCell__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__PopulatedCell__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1603:1: ( ( RULE_INT ) )
            // InternalGol.g:1604:2: ( RULE_INT )
            {
            // InternalGol.g:1604:2: ( RULE_INT )
            // InternalGol.g:1605:3: RULE_INT
            {
             before(grammarAccess.getPopulatedCellAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__XAssignment_1"


    // $ANTLR start "rule__PopulatedCell__YAssignment_3"
    // InternalGol.g:1614:1: rule__PopulatedCell__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__PopulatedCell__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1618:1: ( ( RULE_INT ) )
            // InternalGol.g:1619:2: ( RULE_INT )
            {
            // InternalGol.g:1619:2: ( RULE_INT )
            // InternalGol.g:1620:3: RULE_INT
            {
             before(grammarAccess.getPopulatedCellAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__YAssignment_3"


    // $ANTLR start "rule__Rules__RulesAssignment_2"
    // InternalGol.g:1629:1: rule__Rules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Rules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1633:1: ( ( ruleRule ) )
            // InternalGol.g:1634:2: ( ruleRule )
            {
            // InternalGol.g:1634:2: ( ruleRule )
            // InternalGol.g:1635:3: ruleRule
            {
             before(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RulesAssignment_2"


    // $ANTLR start "rule__Condition__BoolOpAssignment_0"
    // InternalGol.g:1644:1: rule__Condition__BoolOpAssignment_0 : ( ruleBoolOp ) ;
    public final void rule__Condition__BoolOpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1648:1: ( ( ruleBoolOp ) )
            // InternalGol.g:1649:2: ( ruleBoolOp )
            {
            // InternalGol.g:1649:2: ( ruleBoolOp )
            // InternalGol.g:1650:3: ruleBoolOp
            {
             before(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__BoolOpAssignment_0"


    // $ANTLR start "rule__Condition__NCountAssignment_1"
    // InternalGol.g:1659:1: rule__Condition__NCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__NCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1663:1: ( ( RULE_INT ) )
            // InternalGol.g:1664:2: ( RULE_INT )
            {
            // InternalGol.g:1664:2: ( RULE_INT )
            // InternalGol.g:1665:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NCountAssignment_1"


    // $ANTLR start "rule__Condition__SeparatorAssignment_2"
    // InternalGol.g:1674:1: rule__Condition__SeparatorAssignment_2 : ( ruleSeparator ) ;
    public final void rule__Condition__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1678:1: ( ( ruleSeparator ) )
            // InternalGol.g:1679:2: ( ruleSeparator )
            {
            // InternalGol.g:1679:2: ( ruleSeparator )
            // InternalGol.g:1680:3: ruleSeparator
            {
             before(grammarAccess.getConditionAccess().getSeparatorSeparatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSeparatorSeparatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SeparatorAssignment_2"


    // $ANTLR start "rule__Rule__StateAssignment_1"
    // InternalGol.g:1689:1: rule__Rule__StateAssignment_1 : ( ruleState ) ;
    public final void rule__Rule__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1693:1: ( ( ruleState ) )
            // InternalGol.g:1694:2: ( ruleState )
            {
            // InternalGol.g:1694:2: ( ruleState )
            // InternalGol.g:1695:3: ruleState
            {
             before(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StateAssignment_1"


    // $ANTLR start "rule__Rule__ConditionsAssignment_4"
    // InternalGol.g:1704:1: rule__Rule__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1708:1: ( ( ruleCondition ) )
            // InternalGol.g:1709:2: ( ruleCondition )
            {
            // InternalGol.g:1709:2: ( ruleCondition )
            // InternalGol.g:1710:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionsAssignment_4"


    // $ANTLR start "rule__Rule__ResultAssignment_6"
    // InternalGol.g:1719:1: rule__Rule__ResultAssignment_6 : ( ruleOutcome ) ;
    public final void rule__Rule__ResultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1723:1: ( ( ruleOutcome ) )
            // InternalGol.g:1724:2: ( ruleOutcome )
            {
            // InternalGol.g:1724:2: ( ruleOutcome )
            // InternalGol.g:1725:3: ruleOutcome
            {
             before(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOutcome();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResultAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001C00000L});

}